import java.util.Arrays;
public class Queue{
    int queueArray[];
    int nItems;
    int fornt;
    int rear;
    int maxSize;

    Queue(int n ){
    this.maxSize=n;
       queueArray = new int[maxSize];
       this.nItems=0;
       this.fornt=0;
       this.rear=-1;
    }
    
    public boolean isFull(){
        return nItems==maxSize;
    }
    public boolean isEmpty(){
        return nItems==0;
    }

    public void push(int data){
        if(!isFull()){
            if(rear==maxSize-1)
            rear=-1;
            queueArray[++rear]=data;
            nItems++;
        }else
        System.out.println("Queue Is Full!!!");
    }

    public void peekFront(){
        if(!isEmpty()){
            System.out.println(queueArray[fornt]); 
        }
        else
            System.out.println("Queue Is Empty!!!");
    }

    public void peekRear(){
        if(!isEmpty())
            System.out.println(queueArray[rear]); 
        else
            System.out.println("Queue Is Empty!!!");
    }

    public int pop(){
        if(!isEmpty()){
            if(fornt==maxSize-1)
               fornt=0;
               nItems--;
               int poped=queueArray[fornt];
               queueArray[fornt++]=0;
            return poped;
        }else
           return -1;
    }

    public int size(){
        return maxSize;
    }

    public String toString(){
        return Arrays.toString(queueArray);
    }


    public static void main (String[] args){
        Queue q = new Queue(5);
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        // q.push(60); queu is full
        q.peekRear();
        q.peekRear();
        q.peekFront();
        q.peekFront();
        q.pop();
        // q.push(70);
        q.peekRear();
        q.pop();
        System.out.println(q.toString());
    }
}