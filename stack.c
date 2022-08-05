#include <stdio.h>
#include <stdlib.h>

int top = -1;

void push(int stack[],int size,int item){
    if(top==size-1){
        printf("Overflow");
        exit(0);
    }
    else{
    top++;
    printf("%d \n",top);
    stack[top]=item;
    }
}
void pop(int stack[],int size){
    if(top==-1){
        printf("underflow");
        exit(0);
    }
    else{
    printf("%d",stack[top]);
    top--;
}
}
void show(int stack[]){
    int i;
    if(top==-1){
        printf("[]");
        
    }
    else{
        for(i=0;i<=top;i++){
            printf("%d ",stack[i]);
        }
    }
}
void peek(int stack[]){
    if(top==-1){
        printf("[]");
       
    }
    else{
       printf("%d",stack[top]); 
    }
    
}

void main(){
    
    int *a;
    int n,ch,item;
    printf("Enter Size: \n");
    scanf("%d",&n);
    a=(int*)malloc(n*sizeof(int));
    do{
        printf("Enter choice \n");
        scanf("%d",&ch);
        switch(ch){
            case 1:
            printf("Enter element\n");
            scanf("%d",&item);
            push(a,n,item);
            break;
            case 2:
            pop(a,n);
            break;
            case 3:
            show(a);
            break;
            case 4:
            peek(a);
            break;
            case 5:
            break;
    }}while(ch!=5);
}
