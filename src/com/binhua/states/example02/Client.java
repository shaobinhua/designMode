package com.binhua.states.example02;

/**
 * Created by shaobinhua on 2017/4/16.
 */
public class Client {
    public static void main(String[] args) {

        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
    }
}
