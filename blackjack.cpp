#include <iostream>
#include <cstdlib>
#include <ctime>
#include <algorithm>
#include <windows.h>
//Christine Fule  BSCS 2-1
using namespace std;

void showIntro(){
		//INTRODUCE THE GAME
		cout<<"\n\nCHRISTINE ANGELINE FULE\t  BSCS 2-1\t  2/11/2022\n"<<endl;
		cout<<"														"<<endl;
		cout<<"|----------------------------------------------------|"<<endl;
		cout<<"|         	WELCOME TO VIRTUAL CASINO!!	     |"<<endl;
		cout<<"|				BLACKJACK            |"<<endl;
		cout<<"|    Where the stake are hig but the numbers are low!|"<<endl;
		cout<<"|  Don't let the dealer win the game. Byby getting a |"<<endl;
		cout<<"|  as close to 21 as possible, without going over 21.|"<<endl;
		cout<<"|      Please press any key to start.Goodluck.       |"<<endl;
		cout<<"|----------------------------------------------------|"<<endl;
	}
void printData(int PlayerTotal, int dCard){
 		cout<<"\n The total of your cards is: "<<PlayerTotal<<endl;
		cout<<"\n The dealer has: "<<dCard << "--> face up"<<endl;	
}

	int getCard(){
		return rand() % 14 + (-3);
	}	
void turn(int& PlayerTotal, char pick, bool& pass) {
	
	//IF THE USER WANTS TO HIT
	if(pick == 'H' || pick == 'h') {
	
	//IF PLAYER HITS 21 OR ABOVE
			if((PlayerTotal += getCard()) >= 21) {
			
			cout<<"Your Total is: "<< PlayerTotal;
			pass = true;
			}
		return;
		
	}
	
		//DOES NOT HIT
		pass = true;	
}
int main(){
	string answer;
	
	showIntro();
	
	bool pass;
	char pick = NULL;
	
	while(true) {
		
		//back from the to start	
		cout<<"==================================================="<<endl;
		pass = false;
		
		//INTITIALIZE SRAND AND GET RANDOM CARD NUM
		srand(time(0));
		int dCard = getCard();
		int PlayerTotal = getCard() + getCard();
		int DealerTotal = dCard + getCard();
		
		//PLAYER RETURN
		while(!pass) {
			
			printData(PlayerTotal, dCard);
			cout<<"\nWould you like to Hit or Pass?\n";
			cin>> pick;
			turn(PlayerTotal, pick, pass);
		}
		pass = false;
		
			cout<<"It is now dealer's turn.\n";
		Sleep(900);
			cout<<".\n";
		Sleep(900);
			cout<<"..\n";
		Sleep(900);
			cout<<"...\n";
			cout<<"Okay the deal went.\n";
			cout<<"The results are...  \n";
		Sleep(3000);
		
		
		//DEALER'S TURN
		while(DealerTotal <= 21 && !pass){
			if(DealerTotal >= 17)
				pass = true;
			else
				DealerTotal += getCard();
		}
		
		//DISPLAY WINNER
		cout<<"The player has " <<PlayerTotal <<".\nThe dealer has "<< DealerTotal<<".\n\n";
		
			if((PlayerTotal < 22)&& (PlayerTotal > DealerTotal) || (DealerTotal > 21) && (PlayerTotal < 22)){
				cout<<"You Win!! Congratulation."<<endl;
			}
				else if((PlayerTotal < 22) && (PlayerTotal == DealerTotal)){
					cout<< "BUST!"<<endl;
				}
			else{
				cout<<"You Lose!! I'm Sorry."<<endl;}
}
}
	
	
