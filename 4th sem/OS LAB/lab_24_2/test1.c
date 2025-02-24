#include <stdio.h>

struct Process {
    int id, arrival, burst, completion, turnaround, waiting;
};

void findCompletionTime(struct Process p[], int n) {
    int time = 0;
    for (int i = 0; i < n; i++) {
        if (time < p[i].arrival) {
            time = p[i].arrival;
        }
        p[i].completion = time + p[i].burst;
        time = p[i].completion;
        p[i].turnaround = p[i].completion - p[i].arrival;
        p[i].waiting = p[i].turnaround - p[i].burst;
    }
}

void printProcesses(struct Process p[], int n) {
    printf("\nProcess\tArrival\tBurst\tCompletion\tTurnaround\tWaiting\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\t%d\t%d\t\t%d\t\t%d\n", 
            p[i].id, p[i].arrival, p[i].burst, 
            p[i].completion, p[i].turnaround, p[i].waiting);
    }
}

int main() {
    int n;
    printf("Enter number of processes: ");
    scanf("%d", &n);

    struct Process p[n];

    printf("Enter Arrival Time and Burst Time for each process:\n");
    for (int i = 0; i < n; i++) {
        p[i].id = i + 1;
        printf("Process %d: ", p[i].id);
        scanf("%d %d", &p[i].arrival, &p[i].burst);
    }

    findCompletionTime(p, n);
    printProcesses(p, n);

    return 0;
}
