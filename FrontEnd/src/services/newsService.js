import axios from 'axios';

const options = {
  method: 'GET',
  url: 'https://unofficial-cricbuzz.p.rapidapi.com/news/list',
  headers: {
    'x-rapidapi-key': 'b078b0c19dmsh581e59d4154a292p1cb72bjsn027ab6ee2e7f',
    'x-rapidapi-host': 'unofficial-cricbuzz.p.rapidapi.com'
  }
};

export const  getNews= async()=>{
try {


	const response = await axios.request(options);
 
	return response.data;

} catch (error) {
	console.error(error);
}

};
