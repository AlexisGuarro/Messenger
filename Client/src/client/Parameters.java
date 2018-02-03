/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author Alexis
 */
public class Parameters {
    private Socket Socket_Client;
    private BufferedReader in; 
    private PrintWriter out; 
    private String Message;
    
    /**
     * 
     * @param P_Port
     * @throws IOException 
     */
    public Parameters (int P_Port) throws IOException {
        Socket_Client = new Socket(InetAddress.getLocalHost(), P_Port);
    }
    
    /**
     * 
     * @throws IOException 
     */
    public void Read_Message () throws IOException{
        setIn(new BufferedReader(new InputStreamReader(getSocket_Client().getInputStream())));
        setMessage(getIn().readLine());
        System.out.println(getMessage());
    }

    /**
     * @return the Socket_Client
     */
    public Socket getSocket_Client() {
        return Socket_Client;
    }

    /**
     * @param Socket_Client the Socket_Client to set
     */
    public void setSocket_Client(Socket Socket_Client) {
        this.Socket_Client = Socket_Client;
    }

    /**
     * @return the in
     */
    public BufferedReader getIn() {
        return in;
    }

    /**
     * @param in the in to set
     */
    public void setIn(BufferedReader in) {
        this.in = in;
    }

    /**
     * @return the out
     */
    public PrintWriter getOut() {
        return out;
    }

    /**
     * @param out the out to set
     */
    public void setOut(PrintWriter out) {
        this.out = out;
    }

    /**
     * @return the Message
     */
    public String getMessage() {
        return Message;
    }

    /**
     * @param Message the Message to set
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }
}
