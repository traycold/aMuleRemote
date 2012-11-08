package com.iukonline.amule.android.amuleremote.helpers.ec;

import java.util.HashMap;

import com.iukonline.amule.android.amuleremote.helpers.ec.tasks.ECPartFileActionAsyncTask.ECPartFileAction;
import com.iukonline.amule.ec.ECCategory;
import com.iukonline.amule.ec.ECPartFile;
import com.iukonline.amule.ec.ECStats;


public abstract interface AmuleWatcher {
    public interface ClientStatusWatcher extends AmuleWatcher {
        
        public enum AmuleClientStatus {
            IDLE, ERROR, WORKING, NOT_CONNECTED
        }
    
        void notifyStatusChange(AmuleClientStatus status); 
    }

    public interface DlQueueWatcher extends AmuleWatcher {
        void updateDlQueue(HashMap<String, ECPartFile> newDlQueue);
    }

    public interface ECStatsWatcher extends AmuleWatcher {
        void updateECStats(ECStats newStats);
    }
    
    public interface CategoriesWatcher extends AmuleWatcher {
        void updateCategories(ECCategory[] newCategoryList);
    }
    
    public interface ECPartFileWatcher extends AmuleWatcher {
        void updateECPartFile(ECPartFile newECPartFile);
    }

    public interface ECPartFileActionWatcher extends AmuleWatcher {
        void notifyECPartFileActionDone(ECPartFileAction action);
    }

    
    String getWatcherId();
}
