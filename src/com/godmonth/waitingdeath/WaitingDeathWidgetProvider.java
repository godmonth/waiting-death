package com.godmonth.waitingdeath;

import org.joda.time.DateTime;
import org.joda.time.Period;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.Log;
import android.widget.RemoteViews;

public class WaitingDeathWidgetProvider extends AppWidgetProvider {
	private static final DateTime start = new DateTime(2004, 2, 5, 0, 0);

	public void onUpdate(Context context, AppWidgetManager appWidgetManager,
			int[] appWidgetIds) {
		for (int i = 0; i < appWidgetIds.length; i++) {
			RemoteViews views = new RemoteViews(context.getPackageName(),
					R.layout.widget1);
			Period period = new Period(start, new DateTime());
			views.setTextViewText(R.id.widget1label, period.getYears() + "."
					+ period.getMonths() + "." + period.getDays());
			appWidgetManager.updateAppWidget(appWidgetIds[i], views);
		}
	}
}
