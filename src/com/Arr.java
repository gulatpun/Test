package com;

public class Arr 
{
    public static void main(String args[])
    {
    	int count=0;
    	int a[] = new int[]{1,1,2,2,3,4,5};
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=1;j<a.length;j++)
    		{
    			if(a[i]==a[j])
    			{
    				count++;
    			}
    			if(count>1)
    			{
    				continue;
    			}
    		}
    		System.out.println(a[i]);
    	}	
    }
}
