package com.fabricio.androidavancado.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fabricio.androidavancado.Adapter.LivroAdapter;
import com.fabricio.androidavancado.Entidade.Autor;
import com.fabricio.androidavancado.Entidade.Livro;
import com.fabricio.androidavancado.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListaLivrosFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_lista_livros2, container, false);
        View view = inflater.inflate(R.layout.fragment_lista_livros, container, false);
        List<Livro> livros = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Autor autor = new Autor();
            autor.setNomeAutor("Autor " + i);
            Livro livro = new Livro("Livro	" + i, "Descricao	" + i, Arrays.asList(autor));
            livros.add(livro);
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.lista_livros);
        recyclerView.setAdapter(new LivroAdapter(livros));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

}
