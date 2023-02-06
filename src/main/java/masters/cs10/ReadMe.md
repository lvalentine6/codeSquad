cs10
-------------

* 프로세스 : 실행중인 프로그램
    * 프로세스의 문맥
        * cpu 수행 상태를 나타내는 하드웨어 문맥
            * 프로그램 카운터
            * 각종 레지스터
        * 각종 프로세스의 주소 공간
            * code, data, stack
        * 프로세스 관련 커널 자료 구조
            * PCB(process Control Block)
            * Kernel stack
              <br/><br/>
    * 프로세스의 상태
        * running
            * cpu를 점유하고 instruction을 수행중인 상태
        * ready
            * cpu를 기다리는 상태(메모리등 다른 조건을 모두 만족하고)
        * blocked(wait, sleep)
            * cpu를 주어도 당장 instruction을 수행할 수 없는 상태
            * 프로세스 자신이 event(IO등) 즉시 만족되지 않아 이를 기다리는 상태
        * suspended(stopped)
            * 외부적인 이유로 프로세스의 수행이 정지된 상태
            * 프로세스는 통째로 디스크에 swap out됨
            * 사용자가 프로그램을 일시 정지시킨 경우, 시스템이 여러 이유로 프로세스를 일지 정지시킴(swapper)
        * new : 프로세스가 생성중인 상태
        * terminated 수행이 끝난 상태
        * blocked : 자신이 요청한 event가 만족되면 ready
        * suspended : 외부에서 resume해 주어야 active
          <br/><br/>
    * 프로세스의 상태 순서
        * new -> ready(in memory) -> running -> waiting -> terminated
        * cpu <-> ready queue <-> IO queue <-> resource queue
            * 프로세스들이 os의 제어에 따라 각 running과 queue를 순회함
            * 커널은 각 프로세스마다 PCB를 생성하여 관리
            * 프로세스가 본인의 코드를 실행중인 상태 : user mode running
            * 프로세스가 system call, interrupt, trap 하게 되어 실행중인 상태 : kernel mode running
              <br/><br/>
    * PCB(process control block) : os가 각 프로세스를 관리하기 위해 프로세스당 유지하는 정보
        * os가 관리상 사용하는 정보
            * process state, process id, scheduling information...
        * cpu 수행 관련 하드웨어 값
            * program counter, registers
        * 메모리 관련
            * code, data, stack
        * 파일관련
            * open file description...
              <br/><br/>
    * 문맥 교환(context switch) : cpu를 한 프로세스에서 다른 프로세르로 넘겨주는 과정
        * cpu를 내어주는 프로세스의 상태를 그 프로세스의 pcb(data 부분)에 저장
        * cpu를 새롭게 얻는 프로세스의 상태를 pcb에서 읽어옴
        * system call이나 interrupt 발생시 반드시 문맥교환이 일어나는건 아님
        *
            1. user mode(프로세스 A) -> kernel mode -> user mode(프로세스 A) : 문맥교환 아님
        *
            2. user mode(프로세스 A) -> kernel mode -> user mode(프로세스 B) : 문맥교환 일어남
        * 1번의 경우에도 문맥이 save되지만 문맥교환이 더 큰 부담을 줌(캐시메모리 삭제)
          <br/><br/>
    * 프로세스를 스케줄링하기 위한 큐
        * job queue
            * 현재 시스템 내에 있는 모든 프로세스의 집합
        * ready queue
            * 현재 메모리 내에 있으면서 cpu를 점유하여 실행되기를 기다리는 프로세스의 집합
        * device queue
            * IO device의 처리를 기다리는 프로세스의 집합
              <br/><br/>
    * 스케줄러(scheduler)
        * long-term-scheduler(장기 스케줄러 or job scheduler)
            * 시작 프로세스 중 어떤 것들을 ready queue로 보낼지 결정
            * 프로세스에 memory등 각종 자원을 주는 문제
            * degree of multiprogramming(메모리에 올라가는 프로세스의 수)을 제어
            * 메모리에 너무 적은 프로세스가 올라가면 cpu낭비 너무 많은 프로세스가 올라가면 성능 저하
            * timesharing system에는 보통 장기 스케줄러가 없음(무조건 ready)
        * short-term-scheduler(단기 스케줄러 or cpu scheduler)
            * 어떤 프로세스를 다음번에 running 시킬지 결정
            * 프로세스에 cpu를 주는 문제
            * millisecond 단위로 빨라야 함
        * medium-term-scheduler(중기 스케줄러 or swapper)
            * 여유 공간 마련을 위해 프로세스를 통째로 메모리에서 디스크로 쫒아냄
            * 프로세스에게서 memory를 뺏는 문제
            * deree of multiprogramming을 제어
* cpu scheduling algorithm
    * FCFS(first come first served)
        * 프로세스의 도착 순서에 따라 대기시간이 다름
    * SJF(shortest job first)
        * 각 프로세스의 다음번 cpu burst time을 가지고 스케줄링에 활용
        * cpu burst time이 가장 짧은 프로세스를 제일 먼저 스케줄
            * Nonpreemptive
                * 일단 cpu를 잡으면 cpu burst가 완료될 때까지 cpu를 뺏기지(preemptive) 않음
            * Preemptive
                * 현재 수행중인 프로세스의 남은 burst time보다 더 짧은 cpu burst time을 가지는 프로세스가 도착하면 뺏김
                * SRTF(Shortest remaining time first) 라고도 부름
        * SJF는 주어진 프로세스에 대해 minimum average waiting time을 보장
        * 문제점 1 : Burst time이 긴 프로세스는 cpu를 영원히 사용하지 못할수도 있다.(starvation)
          -> aging을 통해 해결 : 기다린 시간만큼 우선순위를 올림
        * 문제점 2 : cpu 사용시간을 미리 알 수 없다.
    * cpu burst time 예측
        * 다음번 cpu burst time은 과거의 cpu burst time을 이용해서 추정 (Exponential Averaging)
    * Priority scheduling
        * 높은 우선순위(정수로 우선순위를 표현)를 가진 프로세스에게 cpu 할당
    * Round Robin(RR)
        * 각 프로세스는 동일한 크기의 할당시간을 가짐
        * 할당 시간이 지나면 프로세스는 preempted 당하고 ready queue 제일 뒤에 가서 줄을 선다
        * n개의 프로세스가 ready queue에 있고 할당시간이 q time unit인 경우 프로세스는 최대 q time unit 단위로 cpu를 1/n 얻음
        * 어떤 프로세스도 (n-1)q time unit만큼 기다리지 않음
        * Response time이 빠르다는 장점
        * q가 크면 -> FCFS
        * q가 너무 작으면 문맥교환으로 오버헤드가 커짐
        * 모든 프로세스의 burst time이 같다면 Turnaround time이 늘어날수도 있음
        * Multilevel Queue
    * 여러개의 ready queue를 만들어 각 queue에 우선순위를 매긴다.
        * foreground (interactive)
        * background (batch - no human interaction)
    * 각 queue는 독립적인 스케줄링 알고리즘을 가짐
        * foreground : RR 알고리즘
        * background : FCFS 알고리즘
    * 각 queue에 대한 스케줄링이 필요
        * Fixed priority scheduling
            * 우선순위가 높은 큐에 우선적으로 cpu 할당
            * 우선순위가 높은 큐에 프로세스가 없다면 다음 순위의 큐로 넘어감
            * 낮은 우선순위에 있는 프로세스는 starvation이 발생할 수 있음
        * Time slice
            * 각 큐에 cpu time을 적절한 비율로 할당
            * ex) 높은 우선순위 큐에 80%, 낮은 우선순위 큐에 20% 할당
    * Multilevel Feedback Queue
        * 프로세스가 다른 큐로 이동 가능
        * 처음 들어오는 프로세스는 가장 높은 우선순위 큐로 감
        * 짧은 시간의 할당 시간을 가지고 job을 수행함
        * 할당 시간동안 job을 끝내지 못했다면 다음 우선순위 큐로 내려감
    * Multiple processor scheduling
        * Homogeneous processor 경우
            * 큐에 한줄로 세워서 각 프로세서가 알아서 꺼내가게 할 수 있다.
            * 반드시 특정 프로세서에서 수행되어야 하는 프로세스가 있는 경우는 복잡해짐
        * Load sharing
            * 일부 프로세서에 job이 몰리지 않도록 부하를 적절히 공유
            * 별개의 큐를 두는 방법
            * 공동 큐를 사용하는 방법
            * ex) 화장실 칸마다 줄을 사용하는 방법
        * Symmetric Multiprocessing (SMP)
            * 각 프로세서가 알아서 스케줄링 결정
        * Asymmetric Multiprocessing
            * 하나의 프로세서가 시스템 데이터의 접근과 공유를 책임지고 나머지 프로세서는 따름
    * Real time scheduling
        * Hard real time systems
            * 정해진 시간 안에 반드시 끝내도록 스케줄링 해야 함
        * Soft real time computing
            * 일반 프로세스에 비해 높은 우선순위를 갖도록 해야 함
    * Thread scheduling
        * Local scheduling
            * 유저 레벨 스레드인 경우 사용자 수준의 thread library에 의해 어떤 스레드를 스케줄링 할지 결정
        * Global scheduling
            * 커널 레벨 스레드인 경우 일반 프로세스와 마찬 가지로 커널의 단기 스케줄러가 어떤 스레드를 스케줄링 할지 결정
    * Algorithm Evaluation
        * Queueing models
            * 확율 분포로 주어지는 arrival rate와 service rate를 통해 performance index 값을 계산
        * Implementation & Measurement
            * 실제 시스템에서 알고리즘을 구현하여 실제 작접 성능 측정 비교
        * Simulation
            * 알고리즘을 모의 프로그램으로 작정후 trace를 입력으로 하여 결과 비교

* 기능 구현
  * [x] 6개의 프로세스 생성 후 객체 배열 삽입
  * [ ] 실행할 프로세스 번호와 개수 랜덤 선택
  * [ ] 프로세스 스케줄링 라운드 로빈 방식 설정
  * [ ] 프로세스 실행 경과 초단위로 출력
  * [ ] 프로세스 실행 결과 출력