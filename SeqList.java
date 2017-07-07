public class SeqList{
// basic operation
	// initial Seqlist
	public void Init_SeqList(int size){
		data=new DataType[size];
		last=-1;
	}

	// getlength
	public static int Length_SeqList(){
		return last+1;
	}

	// insert           O(n)
	public static int Insert_SeqList(int i, DataType x){
		if(last==MAXSIZE-1){
			System.out.println("full");
			return -1;
		}
		if(i<1||i>last+2){
			System.out.println("error location");
			return 0;
		}
		for(int j=last;j>i-1;j--){
			data[j+1]=data[j];
		}
		data[i-1]=x;
		last++;
		return 1;
	}

	// delete           O(n)
	public static int Delet_SeqList(int i){
		if (last==-1){
			System.out.println("empty");
			return -1;
		}
		if(i<1||i>last+1){
			System.out.println("error location");
			return 0;
		}
		for(int j=i;j<last;j++){
			data[j]=data[j+1];
		}
		last--;return 1;
	}

	// index depend on x         O(n)
	public static int Location_SeqList(DataType x){
		int i=0;
		while(i<=last){
			if(data[i]==x){
				return i;
			}
			i++;
			if(i>last){
				return -1;
			}		
		}		
	}



	public static void main(String[] args){
// use
		// merge AB to C, all is increace
		public static void merge(SeqList<Datatype> A, SeqList<Datatype> B, SeqList<Datatype> C){
			int i,j,k;
			i=0;j=0;k=0;
			while(i<=A.last&&j<=B.last){
				if(A[i]>=B[j]){
					C[k++]=B[j++];
				}
				else{
					C[k++]=A[i++];					
				}
			}
			while(i<=A.last){
				C[k++]=A[i++];					
			}
			while(j<=B.last){
				C[k++]=B[j++];
			}
			C.last=k-1;			
		}

	}
}