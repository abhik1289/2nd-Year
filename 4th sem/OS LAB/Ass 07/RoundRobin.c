#include <stdio.h>
#include <stdbool.h>

struct Process {
    int id, bt, at, wt, tat, rt;
};

void roundRobinScheduling(struct Process p[], int n, int quantum) {
    int time = 0, remaining = n;
    bool done;

    while (remaining > 0) {
        done = true;
        for (int i = 0; i < n; i++) {
            if (p[i].rt > 0 && p[i].at <= time) {
                done = false;
                if (p[i].rt > quantum) {
                    time += quantum;
                    p[i].rt -= quantum;
                } else {
                    time += p[i].rt;
                    p[i].tat = time - p[i].at;
                    p[i].wt = p[i].tat - p[i].bt;
                    p[i].rt = 0;
                    remaining--;
                }
            }
        }
        if (done) {
            time++;
        }
    }
}

void display(struct Process p[], int n) {
    printf("\nID\tAT\tBT\tTAT\tWT\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\t%d\t%d\t%d\n", p[i].id, p[i].at, p[i].bt, p[i].tat, p[i].wt);
    }
}

int main() {
    int n, quantum;
    printf("Enter number of processes: ");
    scanf("%d", &n);
    
    struct Process p[n];
    printf("Enter AT and BT for each process:\n");
    for (int i = 0; i < n; i++) {
        p[i].id = i + 1;
        scanf("%d %d", &p[i].at, &p[i].bt);
        p[i].rt = p[i].bt;
        p[i].wt = p[i].tat = 0;
    }

    printf("Enter time quantum: ");
    scanf("%d", &quantum);

    roundRobinScheduling(p, n, quantum);
    display(p, n);

    return 0;
}