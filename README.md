# NursdCodindAssignement

Ps: You are given a DAG - directed acyclic graph - which may be disjointed (this represents
courses in a university that must be taken in a particular order, but may represent different
streams).
Identify all nodes with 0 in-degree.
For each such node, generate all possible paths that originate from that node


Algorithm:

  1.While taking an input we maintain 2 thinf
    1.1 inDegree of all nodes -> int a[]
    1.2 List representation for the Graph -> List<Integer>[] nodes
  
  2. Iterate over inDegree Array 
    if( a[i]  == 0)
      //Given Node is 0 in degree node
      //Apply DFS from this node 
      List<Integer> res=new ArraList<>();
      dfs(i,nodes,res);
  
  3. dfs(int cn,List<> nodes,List<> res)
    3.1 Add cn in res array
    3.2 check if given node is last or Not
      if( nodes[cn].size()==0)
        //end
        print(res)
        return
      else
        //Apply go deeper untll you find last node
        for(int d: nodes[cn])
          dfs(d,nodes,res)
          res.remove(res.size()-1)
          //for backtrack
          
        
      
