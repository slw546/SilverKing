package com.ms.silverking.cloud.argus;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import com.ms.silverking.log.Log;
import com.ms.silverking.util.PropertiesHelper;
import com.ms.silverking.util.PropertiesHelper.LogMode;
import com.ms.silverking.util.PropertiesHelper.UndefinedAction;
import com.ms.silverking.util.SafeTimer;

/**
public class Argus {
        if (options.DiskUsageEnforcer != null) {
        }
        
        ph = new PropertiesHelper(prop, LogMode.UndefinedAndExceptions);
            String	customTerminatorDef;
            
            eventsLogDir = ph.getString(propEventsLogDir, defaultEventsLogDir);
            
            customTerminatorDef = ph.getString(Terminator.KillType.CustomTerminator.toString(), UndefinedAction.ZeroOnUndefined);
            if (customTerminatorDef != null) {
            	Terminator.addKillCommand(Terminator.KillType.CustomTerminator.toString(), customTerminatorDef);
            }
        }
        switch (test) {
            Log.warning("RSSCandidateComparisonMode: ", options.rssCandidateComparisonMode);
            return new RSSEnforcer(ph, terminator, options);
    public void enforce() {
    /**
            Log.warning("Argus is starting");
            
    private class ArgusTask extends TimerTask {
        ArgusTask(SafetyEnforcer enforcer) {
        @Override
            delayMillis = enforcer.enforce();