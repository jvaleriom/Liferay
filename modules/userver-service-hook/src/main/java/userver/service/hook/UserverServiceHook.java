package userver.service.hook;

import com.liferay.portal.kernel.service.UserLocalServiceWrapper;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceWrapper;

import java.util.Locale;

import org.osgi.service.component.annotations.Component;

/**
 * @author LIFERAY
 */
@Component(
	immediate = true,
	property = {
	},
	service = ServiceWrapper.class
)
public class UserverServiceHook extends UserLocalServiceWrapper {

	@Override
	public User addUserWithWorkflow(long creatorUserId, long companyId, boolean autoPassword, String password1,
			String password2, boolean autoScreenName, String screenName, String emailAddress, long facebookId,
			String openId, Locale locale, String firstName, String middleName, String lastName, long prefixId,
			long suffixId, boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle,
			long[] groupIds, long[] organizationIds, long[] roleIds, long[] userGroupIds, boolean sendEmail,
			ServiceContext serviceContext) throws PortalException {
		
		System.out.println("Nombre del usuario a ser añadido" + firstName + " " + lastName);
		
		String lastNameModificado = lastName.concat(" XXXX");
		
		System.out.println("Último hombre del usuario cambiado" + lastNameModificado);
		
		// TODO Auto-generated method stub
		return super.addUserWithWorkflow(creatorUserId, companyId, autoPassword, password1, password2, autoScreenName,
				screenName, emailAddress, facebookId, openId, locale, firstName, middleName, lastName, prefixId, suffixId, male,
				birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
				serviceContext);
	}

	public UserverServiceHook() {
		super(null);
	}

}