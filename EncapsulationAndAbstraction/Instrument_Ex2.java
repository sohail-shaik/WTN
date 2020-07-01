package com.wipro.EncapsulationAndAbstraction;

abstract class instrument{
	abstract public void play();
}

class piano extends instrument{
	public void play() {
		System.out.println("Piano is playing tan tan tan tan");
	}
}

class flute extends instrument{
	public void play() {
		System.out.println("Flute is playing toot toot toot");
	}
}

class guitar extends instrument{
	public void play() {
		System.out.println("Guitar is playing tin tin tin tin");
	}
}

public class Instrument_Ex2 {
	public static void main(String[] args) {
		instrument[] ins=new instrument[10];
		for(int i=0;i<3;i++) {
			ins[i]=new piano();
			ins[i].play();
			
		}
		for(int i=3;i<7;i++) {
			ins[i]=new flute();
			ins[i].play();
			
		}
		for(int i=7;i<10;i++) {
			ins[i]=new guitar();
			ins[i].play();
			
		}
		for(int i=0;i<10;i++) {
			if(ins[i] instanceof piano) 
			{
				System.out.println(i+" Piano Object");
			}
			if(ins[i] instanceof flute) 
			{
				System.out.println(i+" Flute Object");
			}
			if(ins[i] instanceof guitar) 
			{
				System.out.println(i+" Guitar Object");
			}
		}
	}

}
