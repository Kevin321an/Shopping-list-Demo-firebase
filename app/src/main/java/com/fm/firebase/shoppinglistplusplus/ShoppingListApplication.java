package com.fm.firebase.shoppinglistplusplus;

import com.firebase.client.Firebase;

/**
 * Includes one-time initialization of Firebase related code
 */
public class ShoppingListApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //it requires to initiate the Firebase before we do anything else with it
        Firebase.setAndroidContext(this);
    }

}