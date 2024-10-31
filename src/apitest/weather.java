/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apitest;

import javax.swing.ImageIcon;

public class weather {
    
    private String _date;
    private String _day;
    private ImageIcon _icon;
    private String _description;
    private String _degree;
    private String _min;
    private String _max;
    private String _humidity;
    
    public String getDate() {
        return _date;
    }

    public void setDate(String _date) {
        this._date = _date;
    }

    public String getDay() {
        return _day;
    }

    public void setDay(String _day) {
        this._day = _day;
    }

    public ImageIcon getIcon() {
        return _icon;
    }

    public void setIcon(ImageIcon _icon) {
        this._icon = _icon;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String _description) {
        this._description = _description;
    }

    public String getDegree() {
        return _degree;
    }

    public void setDegree(String _degree) {
        this._degree = _degree;
    }

    public String getMin() {
        return _min;
    }

    public void setMin(String _min) {
        this._min = _min;
    }

    public String getMax() {
        return _max;
    }

    public void setMax(String _max) {
        this._max = _max;
    }

    public String getHumidity() {
        return _humidity;
    }

    public void setHumidity(String _humidity) {
        this._humidity = _humidity;
    }
}
