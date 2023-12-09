package co.com.choucair.certificacion.PruebaChoucair.models;


import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;


public class ProductData {
    private String productName;
    private String companyName;
    private String categoryName;
    private String unitsInStock;
    private String unitsOrOrder;
    private String reorderLevel;


    public ProductData(DataTable dataTable){
        List<Map<String, String>> mapList = dataTable.asMaps(String.class, String.class);
        this.productName = mapList.get(0).get("productName");
        this.companyName = mapList.get(0).get("companyName");
        this.categoryName = mapList.get(0).get("categoryName");
        this.unitsInStock = mapList.get(0).get("unitsInStock");
        this.unitsOrOrder = mapList.get(0).get("unitsOrOrder");
        this.reorderLevel = mapList.get(0).get("reorderLevel");
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(String unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public String getUnitsOrOrder() {
        return unitsOrOrder;
    }

    public void setUnitsOrOrder(String unitsOrOrder) {
        this.unitsOrOrder = unitsOrOrder;
    }

    public String getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(String reorderLevel) {
        this.reorderLevel = reorderLevel;
    }
}
