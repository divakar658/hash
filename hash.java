
class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer>arr=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            map.put(b[i],map.getOrDefault(b[i],0)+1);
        }
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(a[i]))
            {
                continue;
            }
            else
            {
                arr.add(a[i]);
            }
        }
        return arr;
    }
}