package org.bishop.CreationalDesignPattern.PrototypeDesignPattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NetworkConnection implements Cloneable{

    private String ip;
    private String data;
    private List<String> domain=new ArrayList<>();

    public NetworkConnection(String ip, String data) {
        this.ip = ip;
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<String> getDomain() {
        return domain;
    }

    public void setDomain(List<String> domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", domain=" + domain +
                '}';
    }

    public NetworkConnection() {

    }

    public void loadData() throws InterruptedException {


        this.data="This is the time consuming task and important data";
        this.domain.add("http://google.com");
        this.domain.add("http://instagram.com");
        this.domain.add("http://twitter.com");
        Thread.sleep(5000);

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //Shallow Copy
//        return super.clone();

        //Deep Copy
        NetworkConnection networkConnections = new NetworkConnection(this.ip,this.data);
        networkConnections.domain=new ArrayList<>(domain);
        return networkConnections;

    }
}
