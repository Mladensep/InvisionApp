package com.example.invisionapp.activity.activity.model;

import com.example.invisionapp.R;

import java.util.ArrayList;
import java.util.List;


public class NavigationDrawerItem {

	private String title;
	private int imageId;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public static List<NavigationDrawerItem> getData() {
		List<NavigationDrawerItem> dataList = new ArrayList<>();

		int[] imageIds = getImages();
		String[] titles = getTitles();

		for (int i = 0; i < titles.length; i++) {
			NavigationDrawerItem navItem = new NavigationDrawerItem();
			navItem.setTitle(titles[i]);
			navItem.setImageId(imageIds[i]);
			dataList.add(navItem);


		}
		return dataList;
	}

	private static int[] getImages() {

		return new int[]{
				R.mipmap.contactnav
				, R.mipmap.organisationsnav,
							R.mipmap.countriesnav, R.mipmap.projectsnav,
							R.mipmap.flagnav, 0,
							R.mipmap.usernav, R.mipmap.settingsnav,
							R.mipmap.logoutnav};
	}

	private static String[] getTitles() {

		return new String[] {
				"Contacts", "Organisations", "Countries", "Projects", "Embassies & Consulates", "Account", "My profile", "Settings", "Logout"
		};
	}
}
