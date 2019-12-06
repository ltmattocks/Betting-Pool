/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betting.pool;

class Team{
    String name;
    int stat;
    //constructor
    public Team(){
        this.name = "";
        this.stat = 0;
    }
    //return name of team
    public String getName() {
        return name;
    }
    //return stat of team
    public int getStat() {
        return stat;
    }
    public Team(String name, int stat){
        this.name = name;
        this.stat = stat;
    }
    //toString method
    @Override
    public String toString() {
        return "Team{" + "name=" + name + ", stat=" + stat + '}';
    }
    //set the name of team
    public void setName(String name) {
        this.name = name;
    }
    //set name of stat
    public void setStat(int stat) {
        this.stat = stat;
    }
}


