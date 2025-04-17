package org.company;

public class PhoneInfo {
      private void phoneNumber() {
		System.out.println("phoneNumber:98765434");
	}
      private void phoneMieiNum() {
    	  System.out.println("phoneMieiNum:6554");
	}
      private void camera() {
    	  System.out.println("camera:12pixel");
    }
      private void storage() {
    	  System.out.println("storage:32GB");
	}
      private void osName() {
    	  System.out.println("osName:Color");
	}
      public static void main(String[] args) {
    	  PhoneInfo details = new PhoneInfo();
    	  details.phoneNumber();
    	  details.phoneMieiNum();
    	  details.camera();
    	  details.storage();
    	  details.osName();
	}
}
