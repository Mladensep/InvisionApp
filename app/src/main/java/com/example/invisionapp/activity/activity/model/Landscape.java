package com.example.invisionapp.activity.activity.model;

import com.example.invisionapp.R;

import java.util.ArrayList;


public class Landscape {

	private int imageID;
	private String title;
	private String description;

	public int getImageID() {
		return imageID;
	}

	public void setImageID(int imageID) {
		this.imageID = imageID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static ArrayList<Landscape> getData() {

		ArrayList<Landscape> dataList = new ArrayList<>();

		int[] images = getImages();

		for (int i = 0; i < images.length; i++) {

			Landscape landscape = new Landscape();
			landscape.setImageID(images[i]);
			landscape.setTitle("Contact " + i);

			dataList.add(landscape);
		}

		return dataList;
	}

	public static ArrayList<Landscape> getData2() {

		ArrayList<Landscape> dataList = new ArrayList<>();

		int[] images = getImages2();

		for (int i = 0; i < images.length; i++) {

			Landscape landscape = new Landscape();
			landscape.setImageID(images[i]);
			landscape.setTitle("Countries " + i);

			dataList.add(landscape);
		}

		return dataList;
	}

	public static ArrayList<Landscape> getData3() {

		ArrayList<Landscape> dataList = new ArrayList<>();

		int[] images = getImages2();

		for (int i = 0; i < images.length; i++) {

			Landscape landscape = new Landscape();
			landscape.setImageID(images[i]);
			landscape.setTitle("Embassies & Consulates " + i);

			dataList.add(landscape);
		}

		return dataList;
	}

	public static int[] getImages() {
		return new int[] {
				R.drawable.persona, R.drawable.personb, R.drawable.personv, R.drawable.persong,
				R.drawable.personde, R.drawable.persondj,

				//R.drawable.thumb_1_6, R.drawable.thumb_1_7, R.drawable.thumb_1_8, R.drawable.thumb_1_9,

				R.drawable.persona, R.drawable.personb, R.drawable.personv, R.drawable.persong,
				R.drawable.personde, R.drawable.persondj,// R.drawable.thumb_2_6, R.drawable.thumb_2_7,
//				R.drawable.thumb_2_8, R.drawable.thumb_2_9,

				R.drawable.persona, R.drawable.personb, R.drawable.personv, R.drawable.persong,
				R.drawable.personde, R.drawable.persondj,// R.drawable.thumb_3_6, R.drawable.thumb_3_7,
				//R.drawable.thumb_3_8, R.drawable.thumb_3_9,

				R.drawable.persona, R.drawable.personb, R.drawable.personv, R.drawable.persong,
				R.drawable.personde, R.drawable.persondj,// R.drawable.thumb_4_6, R.drawable.thumb_4_7,
				//R.drawable.thumb_4_8, R.drawable.thumb_4_9,

				R.drawable.persona, R.drawable.personb, R.drawable.personv, R.drawable.persong,
				R.drawable.personde, R.drawable.persondj,// R.drawable.thumb_5_6, R.drawable.thumb_5_7,
//				R.drawable.thumb_5_8, R.drawable.thumb_5_9,

				R.drawable.persona, R.drawable.personb, R.drawable.personv, R.drawable.persong,
				R.drawable.personde, R.drawable.persondj,// R.drawable.thumb_6_6, R.drawable.thumb_6_7,
				//R.drawable.thumb_6_8, R.drawable.thumb_6_9,

//				R.drawable.thumb_7_0, R.drawable.thumb_7_1, R.drawable.thumb_7_2, R.drawable.thumb_7_3,
//				R.drawable.thumb_7_4
		};
	}


	public static int[] getImages2() {
		return new int[] {
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,
				R.drawable.flag1, R.drawable.flag2, R.drawable.flag3, R.drawable.flag1, R.drawable.flag2, R.drawable.flag3,



		};
	}
}