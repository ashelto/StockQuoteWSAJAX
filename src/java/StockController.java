/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import edu.ilstu.it.StockQuoteWS_Service;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author it3530218
 */
@ManagedBean
@RequestScoped
public class StockController {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/StockQuoteApplication/StockQuoteWS.wsdl")
    private StockQuoteWS_Service service;
    private StockController stockController;
    private String stockCode = "";
    
    /**
     * Creates a new instance of StockController
     */
    public StockController() 
    {
    }

    private String getStockPrice(java.lang.String code) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        code = stockCode;
        edu.ilstu.it.StockQuoteWS port = service.getStockQuoteWSPort();
        return port.getStockPrice(code);
    }
   
    public String showStockPrice()
    {
        String temp = getStockPrice(stockCode);
        String timeStamp = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss  aa").format(new Date());
        String temp2 = temp + "        last updated on: " + timeStamp;
        return temp2;
    }
    /**
     * @return the code
     */
    public String getstockCode() {
        return stockCode;
    }

    /**
     * @param stockCode the code to set
     */
    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
    
    
    
}
