#include <stdio.h>

struct Process {
    int id, arrival, burst, completion, turnaround, waiting;
    int visited; // To mark if the process is already executed
};

void sortByArrival(struct Process p[], int n) {
    // Sort processes by Arrival Time (if equal, by Burst Time)
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (p[j].arrival > p[j + 1].arrival) {
                struct Process temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
}

void findCompletionTime(struct Process p[], int n) {
    int time = 0, completed = 0;
    
    while (completed < n) {
        int idx = -1, minBurst = 10000;
        
        for (int i = 0; i < n; i++) {
            if (p[i].arrival <= time && p[i].visited == 0) {
                if (p[i].burst < minBurst) {
                    minBurst = p[i].burst;
                    idx = i;
                }
            }
        }
        
        if (idx == -1) {
            time++; // No process is available, move time forward
        } else {
            p[idx].completion = time + p[idx].burst;
            p[idx].turnaround = p[idx].completion - p[idx].arrival;
            p[idx].waiting = p[idx].turnaround - p[idx].burst;
            p[idx].visited = 1; // Mark process as completed
            time = p[idx].completion;
            completed++;
        }
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
        p[i].visited = 0;
    }

    sortByArrival(p, n);
    findCompletionTime(p, n);
    printProcesses(p, n);

    return 0;
}
