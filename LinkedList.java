import java.util.*

public class LinkedList{
//basic operation

	// initial LinkedList
	private void Init_LinkList(){
		Head=newLinkNode(NULL);
	}

	// insert to head to creat linklist
	public static LinkList Creat_LinkList(){
		LinkList L=new LinkList();
		LinkNode s;
		Scanner scanner= new Scanner(System.in);
		int x=scanner.nextInt;
		while(x!=flag){
			s=new LinkNode(NULL);
			s.data=x;
			s.next=L.Head.next;
			int x=scanner.nextInt;
		}
		return L;
	} 

	// insert to rear to creat linklist
	public static LinkList Creat_LinkList(){
		LinkList L= new LinkList();
		LinkNode s;
		Scanner scanner= new Scanner(System.in);
		int x=scanner.nextInt;	
		while(x!=flag){
			s=new LinkNode(NULL);
			s.data=x;
			s.next=L.Head.next.next; 
			L.Head.next=s;
			int x=scanner.nextInt;	
		}
		return L;
	} 

	// getlength
	public static int Length_LinkList(LinkList L){
		LinkNode p=L.Head.next;
		int j=0;
		while(p.next){
			p.next;
			j++;
		}
		return j;
	}

	// get by i
	public static int Get_LinkList(LinkList L, int i){
		LinkNode p=Head;
		int j=0;
		while(p.next!=NULL&&j<i){
			p=p.next;
			j++;
		}
		if(j==i){
			return p;
		}
		else{
			return NULL;
		}
	}

	// get by x
	public static int Get_LinkList(LinkList L, DataTyppe x){
		LinkNode p=Head;
		int j=0;
		while(p.next!=NULL&&p.data!==x){
			p=p.next;
		}
		return p;
	}

	// s insert to p (back-side)       O(1)
	s.next=p.next;
	p.next=s;

	// s insert to p (front-side)        O(n)
	q=Head;
	while(q.next!=p){
		q=q.next;
	}
	s.next=q.next;
	q.next=s;

	// insert to linklist locate in i
	public static int Get_LinkList(LinkList L, DataTyppe x, int i){
		LinkNode p,s;
		p=Get_LinkList(i-1);
		if(p==Null){
			System.out.println("error i")
			return 0;
		}
		else{
			s=new LinkNode();
			s.data=x;
			s.next=p.next;
			p.next=s;
			return 1;
		}
	}

	// delete p's front-node s      O(n)
	r=Head;
	if(r.next!=p){
		r=r.next;
	}	
	r.next=s.next;

	// delete p's back-node s      O(1)	
	s=p.next;
	p.next=s.next;

	// delete node locate in i       O(n)
	public static int Get_LinkList(LinkList L, int i){
		LinkNode s,p;
		p=Get_LinkList(L,i);
		if(p==NULL){
			System.out.println("i-1 node not exist");
			return -1;
		}
		if(p.next==NULL)
			System.out.println("i node not exist");
			return 0;
		}
		else{
			s=p.next;
			p.next=s.next;
			return 1
		}
	}

	// double LinkList
	p.prior.next = p = p.next.prior;




// use
	public static void main(String[] args){

		// reverse linklist        O(n)
		public static void reverse(LinkList H){
			LinkNode p,q;
			p=H.Head.next;
			H.Head.next=NULL;
			if(p){
				q=p;
				H.Head.next=NULL;
				q.next=H.Head.next;
				H.Head.next=q;
				p=p.next;
			}
		}

		// delete double node      O(n*n)
		public static void pur_LinkList(LinkList H){
			LinkNode p,q;
			p=H.Head.next;
			H.Head.next=NULL;
			while(p.next){
				q=p
				while(q.next!=NULL){
					if(q.data==p.next.data){
						q.next=q.next.next;
					}
					else{
						q=q.next;
					}
				p=p.next;
				}
			}
		}

		// merge AB to C; A and B increase , C decrease         O(n*n)
		public static LinkList merge(LinkList A, LinkList B){
			LinkList C;
			LinkNode p,q,s;
			p=A.Head.next;
			q=B.Head.next;
			C=A;
			C.Head.next(NULL);
			while(p&&q){
				if(p.data>q.data){
					q.next=C.Head.next;
					C.Head.next=q;
					q=q.next;
				}
				else{
					p.next=C.Head.next;
					C.Head.next=p;
					p=p.next;
				}
			}
			while(p){
				p.next=C.Head.next;
				C.Head.next=p;
				p=p.next;
			}
			while(q){
				q.next=C.Head.next;
				C.Head.next=q;
				q=q.next;
			}
		}

		// change LinkList to DLinkList
		public static DList(LinkList L){
			DLinkList H=new DLinkList();
			DLinkNode rear,s;
			LinkNode p;
			rear=H.Head;
			p=L.Head.next;
			while(p){
				s=new DLinkNode(NULL);
				s.data=p.data;
				s.next=rear.next;
				s.prior=rear;
				rear.next=s

			}

		} 	


	}
}