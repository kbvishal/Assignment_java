public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();
	
	int[] arr = new int[size];
	System.out.println("Enter the items");
	for(int i = 0; i<size;i++){
		arr[i] = sc.nextInt();
	}
	
	System.out.println("highest value item is "+ max(arr,0,arr.length-1));
	
}
	
public static int max(int[] a,int lb,int ub){
	int mid = (lb+ub)/2;
	
	if(lb == 0 && ub == 0)
		  return a[lb];
	else if(lb == 0 && ub == 1){
		if(a[lb] >= a[ub]) 
			return a[lb];
		else 
			return a[ub]; 
	}
	else if (ub == (a.length-1) && lb == (a.length-2)){
		if(a[lb] >= a[ub]) 
			return a[lb];
		else 
			return a[ub]; 
	}
	else{
		
		int lb1=mid-1,ub1=mid+1;
		
		if(a[lb1] == a[mid] || a[mid] == a[ub1]){
			while(a[lb1] == a[mid]){
				
				lb1--;
			}
			while(a[ub1] == a[mid])
			    ub1++; 			
		}
		
		if(a[mid] > a[lb1] && a[mid] > a[ub1]){
			return a[mid];
		}
		else{
			if(a[mid] > a[lb1] && a[mid] < a[ub1]){
				
				return max(a,mid,ub);
			}
			else
				return max(a,lb,mid);
			
		}
	}