package OpenClosed_DesignPrinciple.NotificationHandle.ProblematicCode;

public enum Notifications {

    SMS ,

    EMAIL ,

    WHATSAPP;

    public void sendSmsNotification(){
        System.out.println(" SMS Send To The USer ");

    }
    public void sendWhatsappNotification(){
        System.out.println("Send WhatSap notification to the user");
    }

    public void sensEmailNotification(){
        System.out.print("Send Email to the User ");
    }
}
