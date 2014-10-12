package com.iwebpp.libuvpp;

import com.iwebpp.libuvpp.R;
import com.iwebpp.libuvpp.tests.*;
import com.iwebpp.node.tests.DnsTest;
import com.iwebpp.node.tests.EE2Test;
import com.iwebpp.node.tests.HttpParserTest;
import com.iwebpp.node.tests.HttpTest;
import com.iwebpp.node.tests.HttppTest;
import com.iwebpp.node.tests.StreamTest;
import com.iwebpp.node.tests.TcpTest;
import com.iwebpp.node.tests.UdtTest;
import com.iwebpp.node.tests.UrlTest;
import com.iwebpp.wspp.tests.WebSocketServerTest;
import com.iwebpp.wspp.tests.WebSocketTest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// UVPP Unit tests 
		/*new VersionTest().start();
		new CWDTest().start();
		new TCPHandleTest().start();
		new UDTHandleTest().start();
		new UDPHandleTest().start();
		new LoopHandleTest().start();
		new IdleHandleTest().start();
		new TimerHandleTest().start();
		new AsyncHandleTest().start();
		*/
		///new PipeHandleTest().start();
		///new ProcessHandleTest().start();
		///new TCPHandleTest().start();

		///new FileEventHandleTest().start();
		
		// Node Unit tests
		new EE2Test().start();
		new StreamTest().start();
        new TcpTest().start();
        new UdtTest().start();
		
		new HttpParserTest().start();
		new DnsTest().start();
		new HttpTest().start();
		new HttppTest().start();
		new UrlTest().start();
		///new WebSocketTest().start();
		new WebSocketServerTest().start();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
