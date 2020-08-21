//package Challange;

import java.io.*;
import java.util.*;

public class NURSD {

    public static void main(String[] args) throws Exception {


        new NURSD().getResult();
        //new Solution().getResult();
        //new Main().getResult();
        //new Codechef().getResult();
    }

    public void getResult() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Local  Sublime Compilar Start

        File ipFile = new File("input.txt");
        br = new BufferedReader
                (new FileReader(ipFile));
        PrintStream opFile = new PrintStream(new File("output.txt"));
        PrintStream console = System.out;
        // System.setOut(console); 
        System.setOut(opFile);

        //Local Sublime Compilar End

        int n = Integer.parseInt(br.readLine().trim());

        List<Integer>[] nodes=new List[n];
        for(int i=0;i<n;i++){
            nodes[i]=new ArrayList<>();
        }
        int[] inDegree=new int[n];
        int ne = Integer.parseInt(br.readLine().trim());
        for(int i=0;i<ne;i++ ){
            String[] ip=br.readLine().trim().split(" ");
            int s=Integer.parseInt(ip[0]);
            int d=Integer.parseInt(ip[1]);
            inDegree[d]++;
            nodes[s].add(d);
        }

//        System.out.println(Arrays.toString(inDegree));
        for(int i=0;i<n;i++){
            if(inDegree[i]!=0){
                continue;
            }

            dfs(i,nodes,new ArrayList<>());
            //given Directed Asyclic Graph so we
            // dont ned to check about cycle

        }

    }

    private void dfs(int cn, List<Integer>[] nodes,List<Integer> res) {
        res.add(cn);
        if(nodes[cn].size()==0){
            System.out.println(res);

            return;
        }
        for(int d:nodes[cn]){
            dfs(d,nodes,res);
            res.remove(res.size()-1);
        }

    }



}