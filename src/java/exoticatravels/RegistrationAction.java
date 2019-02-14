package exoticatravels;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
/**
 *
 * @author Lenovo
 */
public class RegistrationAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    private static final String ERROR = "error";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
       RegistrationBean rBean = (RegistrationBean)form;
String uName = rBean .getUsername();
String uID = rBean .getUserid();
String pwd = rBean .getPassword();
String rpwd = rBean .getReenterpassword();
String address = rBean .getAdress();
String state= rBean .getState();
String country  = rBean.getCountry();
String group ="customer";
String msg;
EntityManagerFactory emf = Persistence.createEntityManagerFactory("ExoticaTravelsPU");
EntityManager em = emf.createEntityManager();
EntityTransaction userTransaction =em.getTransaction();
userTransaction.begin();
Query query = em.createNativeQuery("Select UserName From Registration WHERE UserID='"+uID+"'");
List idList = query.getResultList();
if (idList.size()==1)
{
	msg = "UserID Already Exists";
	request.setAttribute("errMsg",msg);
	return mapping.findForward(ERROR);
}
else if (!pwd.equals(rpwd)|| pwd =="")
{
	msg ="Password not entered or entered passwords do not match";
		request.setAttribute("eerMsg", msg);
                request.setAttribute("errMsg", msg);
		return mapping.findForward(ERROR);
}

else

{
    RegistrationEntity re = new RegistrationEntity();
    re.setUsername(uName);
    re.setUserid(uID);
    re.setPassword(pwd);
    re.setAdress(address);
    re.setCountry(country);
    re.setGroupname("customer");
    em.persist(re);
    userTransaction.commit();
    em.close();
    emf.close();
    msg=uName;
    request.setAttribute ("NewUser", msg);
    return mapping.findForward(SUCCESS);
    
   
}}}