package android.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/5/11 0011.
 */

public class City extends DataSupport{
    private int id;
    //市的名字
    private String cityName;
    //市的代号
    private String cityCode;
    //当前是所属省的id值
    private String provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }
}
