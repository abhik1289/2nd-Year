#include <stdio.h>

struct Process {
    int id, bt, at, wt, tat, ct;
};

void sortByArrival(struct Process p[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (p[j].at > p[j + 1].at) {
                struct Process temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
}

void sjfScheduling(struct Process p[], int n) {
    int completed = 0, time = 0;
    int visited[n];

    for (int i = 0; i < n; i++) visited[i] = 0;

    while (completed < n) {
        int minIdx = -1;
        for (int i = 0; i < n; i++) {
            if (!visited[i] && p[i].at <= time) {
                if (minIdx == -1 || p[i].bt < p[minIdx].bt) {
                    minIdx = i;
                }
            }
        }

        if (minIdx == -1) {
            time++;
        } else {
            p[minIdx].ct = time + p[minIdx].bt;
            p[minIdx].tat = p[minIdx].ct - p[minIdx].at;
            p[minIdx].wt = p[minIdx].tat - p[minIdx].bt;
            visited[minIdx] = 1;
            time = p[minIdx].ct;
            completed++;
        }
    }
}

void display(struct Process p[], int n) {
    printf("\nID\tAT\tBT\tCT\tTAT\tWT\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\t%d\t%d\t%d\t%d\n", p[i].id, p[i].at, p[i].bt, p[i].ct, p[i].tat, p[i].wt);
    }
}

int main() {
    int n;
    printf("Enter number of processes: ");
    scanf("%d", &n);
    
    struct Process p[n];
    printf("Enter AT and BT for each process:\n");
    for (int i = 0; i < n; i++) {
        p[i].id = i + 1;
        scanf("%d %d", &p[i].at, &p[i].bt);
        p[i].wt = p[i].tat = p[i].ct = 0;
    }

    sortByArrival(p, n);
    sjfScheduling(p, n);
    display(p, n);

    return 0;
}