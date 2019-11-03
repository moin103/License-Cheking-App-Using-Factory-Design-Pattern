package LicenseCheckingApp.common;

import java.util.ArrayList;
import java.util.List;

import LicenseCheckingApp.VM.UserVM;
import LicenseCheckingApp.model.User;

public class Converter {
	
		public static List<UserVM> getUserVMList(List<User> users) {
			List<UserVM> userVMList=new ArrayList();
			users.forEach(user->{
				userVMList.add(getUserVM(user));
			});
			return userVMList;
			
		}

		public static UserVM getUserVM(User user) {
			if(user!=null) {
			return new UserVM(user.getId(),user.getName(),user.getLicensetype(),user.getValidTill());
			}
			return null;
		}
/*
		private static LicenseTypeVM getLicenseTypeVM(LicenseType lt) {
			if(lt!=null) {
			return new LicenseTypeVM(lt.getName(),lt.getId());
			}
			else{
				return null;
			}
*/		
}

