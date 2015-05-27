package com.abhay.alertgame;

import com.abhay.framework.Screen;
import com.abhay.framework.implementation.AndroidGame;

public class AlertGame extends AndroidGame {

	@Override
	public Screen getInitScreen() {
		return new LoadingScreen(this);
	}
	@Override
	public void onBackPressed() {
	getCurrentScreen().backButton();
	}


}
