package com.company.CabInvoice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAccount {

    public static Map<String, List<Ride>> userMap=new HashMap<>();
    public UserAccount(String userName, List<Ride> rideList) {

        userMap.put(userName,rideList);
    }
}
