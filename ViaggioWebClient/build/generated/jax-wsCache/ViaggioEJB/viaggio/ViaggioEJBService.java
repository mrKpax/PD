
package viaggio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ViaggioEJBService", targetNamespace = "http://viaggio/", wsdlLocation = "http://localhost:8080/ViaggioEJBService/ViaggioEJB?wsdl")
public class ViaggioEJBService
    extends Service
{

    private final static URL VIAGGIOEJBSERVICE_WSDL_LOCATION;
    private final static WebServiceException VIAGGIOEJBSERVICE_EXCEPTION;
    private final static QName VIAGGIOEJBSERVICE_QNAME = new QName("http://viaggio/", "ViaggioEJBService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ViaggioEJBService/ViaggioEJB?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VIAGGIOEJBSERVICE_WSDL_LOCATION = url;
        VIAGGIOEJBSERVICE_EXCEPTION = e;
    }

    public ViaggioEJBService() {
        super(__getWsdlLocation(), VIAGGIOEJBSERVICE_QNAME);
    }

    public ViaggioEJBService(WebServiceFeature... features) {
        super(__getWsdlLocation(), VIAGGIOEJBSERVICE_QNAME, features);
    }

    public ViaggioEJBService(URL wsdlLocation) {
        super(wsdlLocation, VIAGGIOEJBSERVICE_QNAME);
    }

    public ViaggioEJBService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VIAGGIOEJBSERVICE_QNAME, features);
    }

    public ViaggioEJBService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ViaggioEJBService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ViaggioEJB
     */
    @WebEndpoint(name = "ViaggioEJBPort")
    public ViaggioEJB getViaggioEJBPort() {
        return super.getPort(new QName("http://viaggio/", "ViaggioEJBPort"), ViaggioEJB.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ViaggioEJB
     */
    @WebEndpoint(name = "ViaggioEJBPort")
    public ViaggioEJB getViaggioEJBPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://viaggio/", "ViaggioEJBPort"), ViaggioEJB.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VIAGGIOEJBSERVICE_EXCEPTION!= null) {
            throw VIAGGIOEJBSERVICE_EXCEPTION;
        }
        return VIAGGIOEJBSERVICE_WSDL_LOCATION;
    }

}
