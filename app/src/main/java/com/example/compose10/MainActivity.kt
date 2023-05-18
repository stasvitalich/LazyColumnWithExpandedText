package com.example.compose10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose10.composables.ItemRow
import com.example.compose10.data.ItemRowModel
import com.example.compose10.ui.theme.Compose10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose10Theme {

                LazyColumn(modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)) {
                    itemsIndexed(
                        listOf(
                            ItemRowModel(
                                R.drawable.akinfeev,
                                "Акинфеев",
                                "Один из самых титулованных вратарей в истории российского футбола. Легенда ЦСКА."
                            ),
                            ItemRowModel(
                                R.drawable.drogba,
                                "Дрогба",
                                "Известный нападающий, который блистал в Челси и в национальной сборной. Настоящий лидер."
                            ),
                            ItemRowModel(
                                R.drawable.elcin,
                                "Ельцин",
                                "Первый президент России. На времена его правления пришлось много чего, но зато была демократия."
                            ),
                            ItemRowModel(
                                R.drawable.gaga,
                                "Леди Гага",
                                "Одна из самых талантливых певиц современности. Актрисса. Настоящая звезд поп-музыки."
                            ),
                            ItemRowModel(R.drawable.hasbik, "Хасбик", "Блогер, получивший неожиданную известность. Инфлюенсер."),
                            ItemRowModel(
                                R.drawable.klinton,
                                "Клинтон",
                                "Бывший президент США. Вокруг его президентства и избирательных кампаний всегда было много шума.."
                            ),
                            ItemRowModel(
                                R.drawable.lenin,
                                "Ленин",
                                "Красный тиран, который развалил российскую государственность."
                            ),
                            ItemRowModel(
                                R.drawable.obama,
                                "Обама",
                                "Один изз самых успешных президентов в истории США. Первый чернокожий президент."
                            ),
                            ItemRowModel(
                                R.drawable.povaliy,
                                "Повалий",
                                "Известная украинская певица, которая пользуется большой популярностью и на российской эстраде."
                            ),
                            ItemRowModel(
                                R.drawable.rianna,
                                "Рианна",
                                "Одна из самых популярных певиц современности. В данный момент наслаждается материнством."
                            ),
                            ItemRowModel(
                                R.drawable.sheik,
                                "Шейк",
                                "Известная российская модель, сумевшая построить международную карьеру."
                            ),
                            ItemRowModel(
                                R.drawable.tsoi,
                                "Цой",
                                "Кумир миллионов, который стал голосом целых поколений. Рок музыкант."
                            )
                        )

                    ) { index, item ->

                        ItemRow(item = item)
                    }
                }
            }
        }
    }
}

