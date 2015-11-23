package daniel.juanfer.metodosnumericos;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;
    public final static String EXTRA_MESSAGE = "daniel.juanger.metodosnumericos.MESSAGE";
    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void createBusquedas(View view){
        Intent intent = new Intent(this, BusquedasIncrementales.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }

    public void createGrafica(View view){
        Intent intent = new Intent(this, Graficador.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createBiseccion(View view){
        Intent intent = new Intent(this, Biseccion.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createNewton(View view){
        Intent intent = new Intent(this, Newton.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);

    }
    public void createReglaFalsa(View view){
        Intent intent = new Intent(this, Reglafalsa.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);

    }
    public void createPuntofijo(View view){
        Intent intent = new Intent(this, Puntofijo.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createSecante(View view){
        Intent intent = new Intent(this, Secante.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createRaicesmultiples(View view){
        Intent intent = new Intent(this, Raicesmultiples.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createEleminaciongaussianasinpivoteo(View view){
        Intent intent = new Intent(this, EliminacionGaussianaSinPivoteo.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createEliminacionGaussianaconpivoteoparcial(View view){
        Intent intent = new Intent(this, EliminacionGaussianaPivoteoParcial.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createEliminacionGaussianaconpivoteototal(View view){
        Intent intent = new Intent(this, EliminacionGaussianaConPivoteoTotal.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createFactorizacionluconeliminaciongaussianasinpivoteo(View view){
        Intent intent = new Intent(this, FactorizacionLuConEliminacionGSinPivoteo.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createFactorizacionluconeliminaciongaussianaconpivoteoparcial(View view){
        Intent intent = new Intent(this, FactorizacionLuConEliminacionGConPivoteoParcial.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createFactorizacionluconeliminaciongaussianaconpivoteototal(View view){
        Intent intent = new Intent(this, FactorizacionLuConEliminacionGConPivoteoTotal.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createCholesky(View view){
        Intent intent = new Intent(this, Cholesky.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createCrout(View view){
        Intent intent = new Intent(this, Crout.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createDoolittle(View view){
        Intent intent = new Intent(this, Doolittle.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }
    public void createGaussseidel(View view){
        Intent intent = new Intent(this, GaussSeidel.class);
        EditText editText = (EditText) findViewById(R.id.txtEcuacion);
        String ecuacion = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,ecuacion);
        startActivity(intent);
    }




    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "About";
                case 1:
                    return "Lineales";
                case 2:
                    return "Matrices";
                case 3:
                    return "Interp";
            }
            return null;
        }
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            if(getArguments().getInt(ARG_SECTION_NUMBER)==1){
                View rootView = inflater.inflate(R.layout.about,container, false);
                return rootView;

            }
            if(getArguments().getInt(ARG_SECTION_NUMBER)==2) {
                View rootView = inflater.inflate(R.layout.main_ecuaciones_lineales, container, false);
                return rootView;

            }if(getArguments().getInt(ARG_SECTION_NUMBER)==3) {
                View rootView = inflater.inflate(R.layout.main_ecuaciones_matrices, container, false);
                return rootView;

            }if(getArguments().getInt(ARG_SECTION_NUMBER)==4){
                View rootView = inflater.inflate(R.layout.main_interpolacion, container, false);
                return rootView;
            }else{
                View rootView = inflater.inflate(R.layout.about, container, false);
                return rootView;
            }
        }
    }
}
