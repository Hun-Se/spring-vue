<script setup>
import axios from 'axios';


axios.get('http://localhost:9000/edu_eleventh/list')
  .then(function (response) {
    const container = document.querySelector(".container");
    console.log(response.data);
    response.data.forEach(element => {
      container.innerHTML += `<div>${element["abName"]}</div>`
    });
  })
  .catch(function (error) {
    console.log(error);
  })

</script>

<template>
  <div>
    hi
    <div class="container"></div>
  </div>
</template>