//Input - n --> Integer Variable
//	  First-->Integer array of size n (independent)
// 	  Second-->Integer array of size n (dependent on First array)

//this class will sort array first and on the basis of First array Index it will rearrange element of second array

// Example 	Input  		First {8,2,4,6,9,5,1,3,7}
// 	   	 		Second {1,2,3,4,5,6,7,8,9} 

//	   	Output 		First {1,2,3,4,5,6,7,8,9}
//		 		Second {7,2,8,3,6,4,9,1,5}

public class Couple_sort {
public static void main(String args[])
{
	
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int[] first=new int[n];
	int[] second=new int[n];
	for(int i=0;i<n;i++)
	{
		first[i]=scan.nextInt();
		second[i]=i;
	}
	first=merge_sort(first,second,0,n-1);
	for(int i=0;i<first.length;i++)
	{
	System.out.println(first[i]+" "+second[i]);
	}
}
                    //FOR <INTEGER,INTEGER>
public static int[] merge_sort(int[] first,int[] second,int start,int end)
{
	if(start>=end)
		return first;
	int mid=(start+end)/2;
	first=merge_sort(first,second,start,mid);
	first=merge_sort(first,second,mid+1,end);
	first=merge(first,second,start,mid,end);
	return first;
}

public static int[] merge(int[] first,int[] second,int start,int mid,int end )
{
	int s1=start,s2=mid+1;
	int[] firstHalf=new int[end-start+1];
	int[] secondHalf=new int[end-start+1];
	for(int i=0;i<=end-start;i++)
	{
		if(s1<=mid&&s2<=end)
		{
			if(first[s1]<first[s2])
			{
				firstHalf[i]=first[s1];
				secondHalf[i]=second[s1];
				s1++;
			}
			else
			{
				firstHalf[i]=first[s2];
				secondHalf[i]=second[s2];
				s2++;
			}
		}
		else if(s1<=mid)
		{
			firstHalf[i]=first[s1];
			secondHalf[i]=second[s1];
			s1++;
		}
		else
		{
			firstHalf[i]=first[s2];
			secondHalf[i]=second[s2];
			s2++;
		}
	}
	for(int i=0;i<=end-start;i++)
	{
		first[start+i]=firstHalf[i];
		second[start+i]=secondHalf[i];
	}
	return first;
}

                         //CLOSED <INTEGER,INTEGER>

                         // FOR   <INTEGER,STRING>
public static int[] merge_sort(int[] first,String[] second,int start,int end)
{
	if(start>=end)
		return first;
	int mid=(start+end)/2;
	first=merge_sort(first,second,start,mid);
	first=merge_sort(first,second,mid+1,end);
	first=merge(first,second,start,mid,end);
	return first;
}

public static int[] merge(int[] first,String[] second,int start,int mid,int end )
{
	int s1=start,s2=mid+1,e=end;
	int[] firstHalf=new int[end-start+1];
	String[] secondHalf=new String[end-start+1];
	for(int i=0;i<=end-start;i++)
	{
		if(s1<=mid&&s2<=end)
		{
			if(first[s1]<first[s2])
			{
				firstHalf[i]=first[s1];
				secondHalf[i]=second[s1];
				s1++;
			}
			else
			{
				firstHalf[i]=first[s2];
				secondHalf[i]=second[s2];
				s2++;
			}
		}
		else if(s1<=mid)
		{
			firstHalf[i]=first[s1];
			secondHalf[i]=second[s1];
			s1++;
		}
		else
		{
			firstHalf[i]=first[s2];
			secondHalf[i]=second[s2];
			s2++;
		}
	}
	for(int i=0;i<=end-start;i++)
	{
		first[start+i]=firstHalf[i];
		second[start+i]=secondHalf[i];
	}
	return first;
}
}
