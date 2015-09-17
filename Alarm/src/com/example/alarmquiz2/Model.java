package com.example.alarmquiz2;

import java.lang.Math;

public class Model {
	private Question[] group1;
	private Question[] group2;
	private Question[] group3;
	private Question[] group4;
	private Question[] group5;
	private Question[] group6;
	private Question[] group7;
	private Question[] group8;
	private Question[] arrayQuestion;
	private int counter;
	private int place;
	private Settings settings;
	private int size;

	public Model() {
		settings = new Settings();
		counter = 0;
		group1 = new basicMath().getGroup();// initialize all groups before
		// arrayQuestion
		group2 = new basicHistory().getGroup();
		group3 = new basicGeog().getGroup();
		group4 = new basicPopCulture().getGroup();
		group5 = new basicDisney().getGroup();
		group6 = new basicTechnology().getGroup();
		group7 = new basicBiology().getGroup();
		group8 = new basicVirginiaTech().getGroup();
		update();
	}

	public void update() {
		place = 0;
		size = (settings.getNum() * 10);
		arrayQuestion = new Question[size];
		if (settings.getGroup1()) {
			for (int i = 0; i < group1.length; i++)// begin repeatable sequence
			{
				arrayQuestion[place] = group1[i];
				place++;
			}
		}
		// end repeatable sequence
		if (settings.getGroup2()) {
			for (int i = 0; i < group2.length; i++)// begin repeatable sequence
			{
				arrayQuestion[place] = group2[i];
				place++;
			} // end repeatable sequence
		}
		if (settings.getGroup3()) {
			for (int i = 0; i < group3.length; i++)// begin repeatable sequence
			{
				arrayQuestion[place] = group3[i];
				place++;
			}
		}
		// end repeatable sequence
		if (settings.getGroup4()) {
			for (int i = 0; i < group4.length; i++)// begin repeatable sequence
			{
				arrayQuestion[place] = group4[i];
				place++;
			} // end repeatable sequence
		}
		if (settings.getGroup5()) {
			for (int i = 0; i < group5.length; i++)// begin repeatable sequence
			{
				arrayQuestion[place] = group5[i];
				place++;
			}
		}
		// end repeatable sequence
		if (settings.getGroup6()) {
			for (int i = 0; i < group6.length; i++)// begin repeatable sequence
			{
				arrayQuestion[place] = group6[i];
				place++;
			} // end repeatable sequence
		}
		if (settings.getGroup7()) {
			for (int i = 0; i < group7.length; i++)// begin repeatable sequence
			{
				arrayQuestion[place] = group7[i];
				place++;
			} // end repeatable sequence
		}
		if (settings.getGroup8()) {
			for (int i = 0; i < group8.length; i++)// begin repeatable sequence
			{
				arrayQuestion[place] = group8[i];
				place++;
			} // end repeatable sequence
		}
		for (place = size - 1; place > 0; place--) // randomizer
		{
			int set = (int) (Math.random() * size);
			Question temp = arrayQuestion[set];
			arrayQuestion[set] = arrayQuestion[place];
			arrayQuestion[place] = temp;
		}
		settings.updated();
	}

	public Question getQuestion() {
		if (counter >= arrayQuestion.length) {
			counter = 0;
		}
		Question temp = arrayQuestion[counter];
		counter++;

		return temp;

	}

}
