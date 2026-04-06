package CodingExercise;

import java.util.Scanner;

public class Labpro2 {

static  int [][] cost;
static  int n;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter no of vertices ");
         n = sc.nextInt();

        cost = new int [n+1][n+1];

        System.out.println(" enter the adjaceny matrix");
        for (int i =1 ; i<=n ; i++)
        {
            for (int j =1 ; j<=n;j++)
            {
                cost[i][j]= sc.nextInt();

                if (cost[i][j]==0)
                {
                    cost[i][j]=999;
                }

            }
        }

        prims();


    }

    static  void prims()
    {
        int [] visited = new int [n+1];
        int mincost = 0;
        int edges = 1;
        visited[1]=1;


        while( edges <n)
        {
            int min=999;
            int u = 0;
            int v =0;

            for ( int i =1; i<=n;i++) {
                if (visited[i] == 1) {
                    for (int j = 1; j <= n; j++) {
                        if (visited[j] == 0 && cost[i][j] < min) {
                            min = cost[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }

            System.out.println(" edges "+ edges + " cost  of " + u + " and " + v + " is " +min);
            visited[v]=1;
mincost+=min;
            edges++;


        }


        System.out.println(" mincost " + mincost)  ;




    }






}
