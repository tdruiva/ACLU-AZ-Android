package net.openwatch.acluaz.model;

import android.content.Context;

import com.orm.androrm.Model;
import com.orm.androrm.QuerySet;
import com.orm.androrm.field.BooleanField;
import com.orm.androrm.field.CharField;
import com.orm.androrm.field.DoubleField;
import com.orm.androrm.field.IntegerField;


public class Incident extends Model {
	private static final String TAG = "SB1070Incident";

	public CharField first_name = new CharField();
	public CharField last_name = new CharField();
	public CharField address_1 = new CharField();
	public CharField address_2 = new CharField();
	public CharField city = new CharField();
	public CharField state = new CharField();
	public IntegerField zip = new IntegerField(99999);
	public CharField email = new CharField();
	public CharField phone = new CharField();
	
	public CharField agency = new CharField();
	public CharField location = new CharField();
	public CharField datetime = new CharField();
	public CharField description = new CharField();
	public DoubleField device_lat = new DoubleField();
	public DoubleField device_lon = new DoubleField();
	public CharField uuid = new CharField();
	public IntegerField server_id = new IntegerField();
	public BooleanField submitted = new BooleanField();

	public Incident() {
		super();
	}
	
	public static final QuerySet<Incident> objects(Context context) {
        return objects(context, Incident.class);
    }

}
