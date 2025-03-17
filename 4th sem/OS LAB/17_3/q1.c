#include <stdio.h>
#include <unistd.h>

int main()
{
    pid_t pid1, pid2;

    pid1 = fork(); 

    if (pid1 == 0)
    {
        printf("Child Process 1: PID = %d, PPID = %d\n", getpid(), getppid());
    }
    else
    {
        pid2 = fork(); 
        if (pid2 == 0)
        {
            printf("Child Process 2: PID = %d, PPID = %d\n", getpid(), getppid());
        }
        else
        {
            printf("Parent Process: PID = %d\n", getpid());
        }
    }

    //     return 0;
}