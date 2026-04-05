package CodingExercise;

import java.util.Scanner;

public class Dj {

static  int cost [][];
static  int  n ;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" enter no of vertices");
        n = sc.nextInt();
cost = new int[n+1][n+1];
        System.out.println( " enter adjancey matyrix");
        for (int i =1 ; i<=n ;i++)
        {
            for (int j =1 ; j<=n ; j++)
            {
                cost[i][j] = sc.nextInt();
                if ( cost[i][j]== 0)
                {
                    cost[i][j] = 999;
                }
            }
        }
        System.out.println(" enter staring vertes");
        int s = sc.nextInt();

        dj(s);
    }




    static  void dj (int s )
    {
        int [] visited = new int[n+1];
        int [] dist = new int [n+1];

        for ( int i =1;i<=n ; i++)
        {
            visited[i]=0;
            dist[i]=cost[s][i];
        }

        visited[s]=1;
        dist[s]=0;

        for (int k =1 ; k<n;k++)
        {
            int min =999;
            int u =1;
            for (int i =1;i<=n ; i++)
            {
                if ( visited[i]==0 &&  dist[i]<min) {
                    min = dist[i];
                    u = i;
                }
            }

            visited[u]=1;


            for ( int v =1 ; v<=n ; v++)
            {
                if ( visited[v]== 0 && dist[u] + cost[u][v] < dist[v])
                {
                    dist[v]= dist[u]+ cost[u][v];

                }
            }


        }


        for ( int i = 1; i<=n ; i++)
        {
            if (i !=s)
            {
                System.out.println(i + " :" + dist[i]);
            }
        }

    }
}
