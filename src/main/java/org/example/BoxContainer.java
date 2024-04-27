package org.example;

import java.util.ArrayList;
import java.util.List;

public class BoxContainer implements PackageInterface{

    List<PackageInterface> packages = new ArrayList<>();

    public void addPackage(PackageInterface packageInterface){
        packages.add(packageInterface);
    }
    public void removePackage(PackageInterface packageInterface){
        packages.remove(packageInterface);
    }
    public List<PackageInterface> getPackages(){
        return packages;
    }
    public void setPackages(List<PackageInterface> packageInterfaceList){
        this.packages = packageInterfaceList;
    }
    @Override
    public int cost() {
      return packages.stream().mapToInt(o -> o.cost()).sum();
    }
}
