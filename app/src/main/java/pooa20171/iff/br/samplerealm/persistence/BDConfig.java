package pooa20171.iff.br.samplerealm.persistence;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by lglmo on 18/07/2017.
 */

public class BDConfig  extends Application {
        @Override
        public void onCreate() {
            super.onCreate();

            Realm.init(getApplicationContext());

            RealmConfiguration.Builder builder = new RealmConfiguration.Builder();
            builder.name("biblioteca.realm");
            builder.schemaVersion(0);
            builder.deleteRealmIfMigrationNeeded();
            RealmConfiguration realmConfiguration = builder.build();
            Realm.setDefaultConfiguration(realmConfiguration);
        }
}
