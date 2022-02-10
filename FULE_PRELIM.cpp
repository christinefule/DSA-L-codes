#include <iostream>

using namespace std;

//CHRISTINE ANGELINE FULE
// CS 2-1
//PRELIM EXAM

int num;
    //ARRAY INPUT LIST
void initArray(int arr[],int size){
	for(int a=0;a<size;a++){
    cout<<"{"<<a+1 <<"}"<<"Enter elements of array: ";
	cin>>arr[a];
    }
}
//INSERT ARRAY 
void Insert(int arr[],int size){
    int toInsert,newsize= size+1;
    cout<<"Enter the element to insert : ";
    cin>>toInsert;
    int newArr[newsize];
	    
    //DUPLICATE ARRAY
    for(int a=0;a<size; a++){
        newArr[a]=arr[a];
    }

	newArr[size]=toInsert;
    cout<<"Array with inserted element : ";
    
    //PRINT LOOP INSERT
    for(int a=0; a<newsize; a++){
        cout<<newArr[a]<<" ";
    }
 
    cout<<"\n-------------------------------\n"<<endl;
}
void Delete(int arr[],int size){
    bool correct=false;
    int del;
    while(!correct){
        for(int a=0;arr[a]!=0;a++){
            cout<<arr[a]<<" ";
        }
        cout<<"\nChoose what element to delete : ";
        cin>>del;

    //LOOP DELETED ARRAY
        for(int i=0;i<size;i++){
            if(del==arr[i]){
                correct=true;
                for(int j=i;j<size;j++)
                    arr[j]=arr[j+1];
                cout<<"Successfully deleted!\n";
                break;
            }
        } 
        if(!correct){
            cout<<"Choose an element that ONLY exist!\n";
        }
    }
   //PRINT LOOP DELETED ARRAY
    for(int i=0;i<arr[i]!=0;i++){
            cout<<arr[i]<<" ";
    }
    cout<<"\n-----------------------------\n"<<endl;
}
    // SEARCH ARRAY
    int Search(int arr[],int size){
        int find;
        cout<<"Enter the element to be searched : ";
        cin>>find;

    for(int a=0; a<size; a++){
         if(arr[a]==find){
             cout<<"Search is Successful!\n\nPosition of the item searched: "<< a + 1;
             cout<<"\n------------------------------\n"<<endl;
            return 0;
         }
     }
    cout<<"Search is Unsuccessful!";
    cout<<"\n------------------------------\n"<<endl;
}
   
void Action(int arr[],bool &repeat,int size){
    int action;
    cout<<"\nPICK A NUMBER... \n\n";
    cout<<"[1] Search\t [2] Insert\t [3] Delete\t [0] Exit\n ";
    cin>>action;
    
  switch(action){
      case 1:{
            Search(arr,size);
            break;
        }
      case 2:{
            Insert(arr,size);
            break;
        }
      case 3:{
            Delete(arr,size);
            break;
        }
      case 0:{
            repeat = false;
            cout<<"Thank you for using my code! Enjoy the rest of the day! \nGOOD BYE";
			break;        
		}
        default:{
            cout<<"\nPLEASE follow the instruction. Try again.\n\n";
        }
    }
}

int main(){
    int size,num;
    cout<<"2/8/22\n\nCHRISTINE ANGELINE FULE \nBSCS 2-1\n\nPRELIM EXAM\n\n";
    cout<<"--------------------------------------\n";
    cout<<"How many elements: ";
    cin>>size;
    int myarray[size];
    
    //CREATING ARRAY
    initArray(myarray,size);
    bool repeat=true;
    while(repeat){
        Action(myarray,repeat,size);
    }
}
