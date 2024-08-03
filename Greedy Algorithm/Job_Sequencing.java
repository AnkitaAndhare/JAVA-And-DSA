import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Job_Sequencing {
    static class Job {
    int deadline;
    int profit;
    int id;

    public Job(int i, int d, int p){
        id = i;
        deadline = d;
        profit = p;
    }
        
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20}, {1,10}, {1,40}, {1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0; i<jobsInfo.length; i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }
            Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

            ArrayList<Integer> seq = new ArrayList<>();
            int time= 0;
            for(int i=0; i<jobs.size(); i++){
                Job curr = jobs.get(i);
                if(curr.deadline > time){
                    seq.add(curr.id);
                    time++;
                }
            }
            System.out.println("max job = " +seq.size());
            for(int i=0; i<seq.size(); i++){
                System.out.print(seq.get(i)+" ");
            }
          System.out.println();
        }
    }



/*
 given array of jobs where every job has deadline and profit if the job is finished before the deadline. it is also given that every job takes ssingke unit of time so the min possible deadline for any job is 1. maximizze total profit if only one job can be scheduled at time.

 job 1 = 4, 20  4 is deadline 20 is profit
 job B = 1, 10  
 job C = 1, 40
 job D = 1, 30

 BA  10 + 20 = 30
 CA  40 + 20 = 60
 DA  30 + 20 = 50

 Brute force approch 
 find all possible sequence 

 Greedy 
 Max profit...so sort according to profit 

 */